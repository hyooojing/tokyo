package ch4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

	private List<OrderDTO> orderList;
	private String filename;
	
	public OrderDAO(String filename) {
		this.filename = filename;
		this.orderList = loadCsv(filename);
	}

	private List<OrderDTO> loadCsv(String filename2) {
		List<OrderDTO> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			boolean skip = true;
			
			while((line = br.readLine()) != null) {	// 한 줄씩 읽음. null이면 종료
				if(skip) {
					skip = false;
					continue;
				}
				
				String[] part = line.split(",");	// 쉼표를 기준으로 나눔
				int id = Integer.parseInt(part[0].trim());	// 앞 뒤로 여백 제거
				String name = part[1].trim();
				int price = Integer.parseInt(part[2].trim());
				int qty = Integer.parseInt(part[3].trim());
				int current = Integer.parseInt(part[4].trim());
				
				// 새로운 ItemDTO 객체를 만들고 리스트에 추가
				list.add(new OrderDTO(id, name, price, qty, current));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("csv 없음: " + e.getMessage());		
		} catch (Exception e) {
			System.out.println("기타 오류: " + e.getMessage());
		}
		return list;
	}
	
	// 상품 저장
	public void save(OrderDTO dto) {
		orderList.add(dto);
		writeCsv();
	}
	
	// 상품 저장할 때 csv 파일에 함께 저장
	public void writeCsv() {
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			pw.println("id,name,price,qty,current");		// 머릿말
			
			for(OrderDTO dto : orderList) {
				pw.printf("%d,%s,%d,%d,%d\n", dto.getId(), dto.getName(), dto.getPrice(), dto.getQty(), dto.getCurrent());
			}
			
		} catch (Exception e) {
			System.out.println("csv 저장 실패: " + e.getMessage());
		} 
		
	}
	
	public List<OrderDTO> findAll() {
		return orderList;
	}

	// 개별 상품 목록 반환
	public OrderDTO findById(int p_id) {
		for (OrderDTO dto : orderList) {
			if (dto.getId() == p_id)
				return dto;
		}
		return null;
	}
	
	// 개별 상품 삭제
	public boolean delete(OrderDTO product) {
		return orderList.remove(product);
	}
	
	// 개별 상품 수정
	public boolean updateProduct(OrderDTO product, String name, int price, int qty, int current) {
	    if (product == null) 
	    	return false;
	    
	    product.setName(name);
	    product.setPrice(price);
	    product.setQty(qty);
	    product.setCurrent(current);
	    return true;
	}
}

package ch4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

	private List<ItemDTO> itemList;
	private String filename;
	
	// 생성자에서 파일을 받아 리스트 초기화
	public ItemDAO(String filename) {
		this.filename = filename;
		this.itemList = loadCsv(filename);
	}
	
	// csv 파일에서 목록 읽기
	private List<ItemDTO> loadCsv(String filename2) {
		List<ItemDTO> list = new ArrayList<>();
		
		/*
			BufferedReader br = new BufferedReader(); 문서에서 한 줄씩 읽게 함
			FileReader = 파일을 읽을 때 사용, 문자데이터를 한 글자씩 읽음
			
			예외처리 : 프로그램 실행 중에 오류가 발생해도 계속 사용할 수 있게 하는 것
			1. try-catch(-finally)
			2. throws
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;		// 파일에서 읽어온 한 줄 데이터 저장
			boolean skip = true;
			
			while((line = br.readLine()) != null) {	// 한 줄씩 읽음. null이면 종료
				if(skip) {
					skip = false;
					continue;	// 실행 중 만나면 건너뜀, 파일의 처음에 머릿말이 있는 경우 건너뜀
				}
				
				// Integer.parseInt() 문자열을 숫자로 변환
				String[] part = line.split(",");	// 쉼표를 기준으로 나눔
				int id = Integer.parseInt(part[0].trim());	// 앞 뒤로 여백 제거
				String name = part[1].trim();
				int qty = Integer.parseInt(part[2].trim());
				int price = Integer.parseInt(part[3].trim());
				
				// 새로운 ItemDTO 객체를 만들고 리스트에 추가
				list.add(new ItemDTO(id, name, qty, price));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("csv 없음: " + e.getMessage());
			
			
		} catch (Exception e) {
			System.out.println("기타 오류: " + e.getMessage());
			
		}
		return list;
	}

	// 상품 저장
	public void save(ItemDTO dto) {
		itemList.add(dto);
		writeCsv();
	}
	
	// 상품 저장할 때 csv 파일에 함께 저장
	private void writeCsv() {
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			pw.println("id,name,qty,price");		// 머릿말
			
			for(ItemDTO dto : itemList) {
				pw.printf("%d,%s,%d,%d\n", dto.getId(), dto.getName(), dto.getQty(), dto.getPrice());
			}
			
		} catch (Exception e) {
			System.out.println("csv 저장 실패: " + e.getMessage());
		} 
		
	}

	// 전체 상품 목록 반환
	public List<ItemDTO> findAll() {
		return itemList;
	}

	// 개별 상품 목록 반환
	public ItemDTO findById(int p_id) {
		for (ItemDTO dto : itemList) {
			if (dto.getId() == p_id)
				return dto;
		}
		return null;
	}
	
	// 개별 상품 삭제
	public boolean delete(ItemDTO product) {
		return itemList.remove(product);
	}
	
	// 개별 상품 수정
	public boolean updateProduct(ItemDTO product, String name, int qty, int price) {
	    if (product == null) 
	    	return false;
	    
	    product.setName(name);
	    product.setQty(qty);
	    product.setPrice(price);
	    return true;
	}
}

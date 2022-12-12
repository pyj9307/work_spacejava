package ch12_map.treemap_1024;

import java.util.Iterator;
import java.util.TreeMap;

import ch12_collection_1024.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	// Comparator 존재하는 reverseOrder 메서드 이용해서 역(내림차순으로 정렬하기)
	
	public MemberTreeMap()
	{
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member){
		
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId){
		
		if(treeMap.containsKey(memberId)){
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}

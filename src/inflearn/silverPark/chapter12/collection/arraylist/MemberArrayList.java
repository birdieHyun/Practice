package inflearn.silverPark.chapter12.collection.arraylist;

import inflearn.silverPark.chapter12.collection.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberId();
//            if (memberId == tempId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }

        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
        }
//        for (Member member : arrayList) {
//            System.out.println(member);
//        }
        System.out.println();
//        System.out.println(arrayList);
    }
}
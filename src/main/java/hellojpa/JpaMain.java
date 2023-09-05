package hellojpa;

import hellojpa.model.User;
import jakarta.persistence.*;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {

        // create entitymanager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("haha");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // code
//        try {
//            추가
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("홍길동");
//            em.persist(member);


//            찾기
//            List<User> result = em.createQuery("select m from User as m", User.class)
//                    .getResultList();
//
//            for (User user : result) {
//                System.out.println("member.getName() = " + user.getName());
//            }
//
////            수정
////            findMember.setName("홍길동");
//            tx.commit();
//
//        } catch (Exception e) {
//            tx.rollback();
//
//        } finally {
//            // close
//            em.close();
//            emf.close();
//
//        }


    }
}

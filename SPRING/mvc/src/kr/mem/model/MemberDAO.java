package kr.mem.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	// config.xml->read->Connection Pool
	// 초기화 블럭
	private static SqlSessionFactory sqlSessionFactory;
	
	
	static {
		try {
		String resource = "kr/mem/mybatis/config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//전체 회원리스트 가져오기
	public List memberList() {
		SqlSession session = sqlSessionFactory.openSession();
		// |=> Mapper파일 (MemberMapper.xml)과 연결 SQL=select * from member(x)
		List<MemberVO> list = session.selectList("memberList"); //메소드 이름으로 Mapper에다가 Select에다 연결할 수 있는 이름을 연결해준다.
		session.close();//반납
		return list;
	}
	
	public int memberInsert(MemberVO vo) {
		SqlSession session = sqlSessionFactory.openSession(); // 커넥션 가져옴
		int cnt = session.insert("memberInsert", vo); // SQL
		session.commit(); //완료
		session.close(); //반납
		return cnt;
	}
	
	public int memberDelete(int num) {
		SqlSession session=sqlSessionFactory.openSession();
		int cnt = session.delete("memberDelete",num);
		session.commit();
		session.close();
		return cnt;
	}
	
	public MemberVO memberContent(int num) {
		SqlSession session=sqlSessionFactory.openSession();
		MemberVO vo = session.selectOne("memberContent", num);
		session.close();
		return vo;
	}
	
	public int memberUpdate(MemberVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		int cnt = session.update("memberUpdate", vo);
		session.commit();
		session.close(); //반납
		return cnt;
	}
}

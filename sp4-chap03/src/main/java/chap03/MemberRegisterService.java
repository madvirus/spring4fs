package chap03;

import java.util.Date;

public class MemberRegisterService {
	private MemberDao memberDao = new MemberDao();

	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new AleadyExistingMemberException("duplicate email " + req.getEmail());
		}
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(),
				new Date());
		memberDao.insert(newMember);
	}
}

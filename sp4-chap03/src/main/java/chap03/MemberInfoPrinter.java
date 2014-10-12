package chap03;

public class MemberInfoPrinter {

	private MemberDao memDao;

	public void setMemDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음");
			return;
		}
		System.out.printf(
				"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%F\n",
				member.getId(), member.getEmail(),
				member.getName(), member.getRegisterDate());
	}
}

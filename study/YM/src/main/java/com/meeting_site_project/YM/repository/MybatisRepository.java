package com.meeting_site_project.YM.repository;

import com.meeting_site_project.YM.mapper.MemberMapper;
import com.meeting_site_project.YM.vo.AskContent;
import com.meeting_site_project.YM.vo.JoinMember;
import com.meeting_site_project.YM.vo.Member;
import com.meeting_site_project.YM.vo.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Repository
public class MybatisRepository implements Repository {

    MemberMapper memberMapper;

    @Autowired
    public MybatisRepository(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    // JoinMember 객체를 받아서 데이터베이스에 회원 정보를 추가하는 메서드
    public void insertMember(JoinMember joinMember) {
        memberMapper.insertMember(joinMember);
    }

    // 아이디와 비밀번호를 받아서 해당 정보와 일치하는 회원을 조회하는 메서드
    public Member selectByIdPassword(LoginCommand loginCommand) {
        return memberMapper.selectByIdPassword(loginCommand);
    }

    // 아이디를 받아서 해당하는 회원을 조회하는 메서드
    public Member selectById(String userId) {
        return memberMapper.selectById(userId);
    }


    public List<Member> getMemberList() { // 전체 회원 조회를 위한 (관리자)
        return memberMapper.getMemberList();
    }

    public Member selectMemberById(String userId) {
        return memberMapper.selectMemberById(userId);
    }


    // 닉네임을 받아서 해당하는 회원을 조회하는 메서드
    public Member selectByNickName(String nickName) {
        return memberMapper.selectByNickName(nickName);
    }

    // 이메일 아이디와 도메인을 받아서 해당하는 회원을 조회하는 메서드
    public Member selectByEmail(String emailId, String emailDomain) {
        return memberMapper.selectByEmail(emailId, emailDomain);
    }

    public Member selectByPassword(String userPassword, String userId) {
        return memberMapper.selectByPassword(userPassword, userId);
    }
    public void profileUpdate(ProfileUpdate profileUpdate) {
        memberMapper.profileUpdate(profileUpdate);
    }

    public Member findId(FindId findId) {
        return memberMapper.findId(findId);
    }

    public Member findPassword(FindPassword findPassword) {
        return memberMapper.findPassword(findPassword);
    }

    public void changePassword(ChangePassword changePassword) {
        memberMapper.changePassword(changePassword);
    }

    public void updateMemberAdmin(HashMap<String, Object> parameters) {
        memberMapper.updateMemberAdmin(parameters);
    }

    public void deleteMemberById(String userId) {
        memberMapper.deleteMemberById(userId);

    }

    // 고객 문의 서비스 구현
    public List<AskContent> selectAskList() {
        return memberMapper.selectAskList();
    }

    public void insertAsk(AskContent askContent) {
        memberMapper.insertAsk(askContent);
    }



    public AskContent selectAskDetailByAskId(String askId) {
        return memberMapper.selectAskDetailByAskId(askId);
    }

    public List<Notices> selectNoticeList() {
        return memberMapper.selectNoticeList();
    }

<<<<<<< HEAD
}
=======
    public List<Notices> selectNoticeListByUserId(String userId) {
        return memberMapper.selectNoticeListByUserId(userId);
    }
>>>>>>> a7a8f0e698c59bf322c1eeaed80ef0f801f1616f




    public void insertFirstMeeting(GroupInfo groupInfo) {
        memberMapper.insertFirstMeeting(groupInfo);
    }

    public GroupInfo selectByMeeting(int meeting) {
        return memberMapper.selectByMeeting(meeting);
    }

    public List<GroupInfo> selectOnedayGroupList(int groupType) {
        return memberMapper.selectOnedayGroupList(groupType);
    }

    public List<GroupInfo> selectRegulardayGroupList(int groupType){
        return memberMapper.selectRegulardayGroupList(groupType);
    };

    public List<Keyword> selectFirstKeywordList() {
        return memberMapper.selectFirstKeywordList();
    }

    public List<Keyword> selectSecondKeywordList(String firstKeyword) {
        return memberMapper.selectSecondKeywordList(firstKeyword);
    }

    public void insertGroupByKeyword(GroupInfo groupInfo) {
        memberMapper.insertGroupByKeyword(groupInfo);
    }
}

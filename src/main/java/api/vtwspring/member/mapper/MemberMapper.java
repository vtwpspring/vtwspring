package api.vtwspring.member.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void saveMember();
}

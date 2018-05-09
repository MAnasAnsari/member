/**
 * 
 */
package com.member.repository;

import org.springframework.data.repository.CrudRepository;

import com.member.domain.Member;

/**
 * @author muhaa
 *
 */
public interface MemberRepository extends CrudRepository<Member, Long> {

}

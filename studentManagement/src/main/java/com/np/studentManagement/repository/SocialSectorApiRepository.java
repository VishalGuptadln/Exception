package com.np.studentManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.np.studentManagement.entity.SocialSectorAPIEntity;

@Repository
public interface SocialSectorApiRepository extends JpaRepository<SocialSectorAPIEntity, Integer>{

	
	@Query(value="select * from nsdc_social_sector sch WHERE sch.scheme_name = :SchemeName AND sch.district_code = :DistrictCode AND sch.financial_year = :FinancialYear", nativeQuery = true)
	Optional<SocialSectorAPIEntity> findBySchemeNameStateCodeFinancialYear(@Param("SchemeName") String SchemeName,@Param("DistrictCode") String DistrictCode,@Param("FinancialYear") String FinancialYear);

}

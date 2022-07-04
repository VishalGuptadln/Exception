package com.np.studentManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.np.studentManagement.entity.Schemewise_API_Entity;

@Repository
public interface Schemewise_API_Repo extends JpaRepository<Schemewise_API_Entity, Integer> {

	@Query(value="select * from nsdc_schemewise sch WHERE sch.scheme_name = :SchemeName AND sch.district_code = :DistrictCode AND sch.financial_year = :FinancialYear", nativeQuery = true)
	Optional<Schemewise_API_Entity> findBySchemeNameStateCodeFinancialYear(@Param("SchemeName") String SchemeName,@Param("DistrictCode") String DistrictCode,@Param("FinancialYear") String FinancialYear);

}

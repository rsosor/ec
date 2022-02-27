package com.rsosor.ec.demo.service;

import com.rsosor.ec.demo.dto.PmsBrandDto;
import com.rsosor.ec.model.PmsBrand;

import java.util.List;

/**
 * DemoService
 *
 * @author RsosoR
 * @date 2022/2/26
 */
public interface DemoService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandDto pmsBrandDto);

    int updateBrand(Long id, PmsBrandDto pmsBrandDto);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}

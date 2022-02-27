package com.rsosor.ec.demo.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * RestTemplate 示例 Controller
 *
 * @author RsosoR
 * @date 2022/2/27
 */
@RestController
@Api(tags = "RestTemplateDemoController", description = "RestTemplate 示例")
public class RestTemplateDemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${host.mall.admin}")
    private String HOST_MALL_ADMIN;

    @ApiOperation("getForEntity url")
    @GetMapping(value = "/get/{id}")
    public Object getForEntity(@PathVariable Long id) {
        String url = HOST_MALL_ADMIN + "/brand/{id}";
        ResponseEntity<CommonResult> responseEntity = restTemplate.getForEntity(url, CommonResult.class, id);
        return responseEntity.getBody();
    }

    @ApiOperation("getForEntity params")
    @GetMapping(value = "/get2/{id}")
    public Object getForEntity2(@PathVariable Long id) {
        String url = HOST_MALL_ADMIN + "/brand/{id}";
        Map<String, String> params = new HashMap<>();
        params.put("id", String.valueOf(id));
        ResponseEntity<CommonResult> responseEntity = restTemplate.getForEntity(url, CommonResult.class, params);
        return responseEntity.getBody();
    }

    @ApiOperation("getForEntity Uri")
    @GetMapping(value = "/get3/{id}")
    public Object getForEntity3(@PathVariable Long id) {
        String url = HOST_MALL_ADMIN + "/brand/{id}";
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(url).build().expand(id).encode();
        ResponseEntity<CommonResult> responseEntity = restTemplate.getForEntity(uriComponents.toUri(), CommonResult.class);
        return responseEntity.getBody();
    }

    @ApiOperation("getForEntity url")
    @GetMapping(value = "/get4/{id}")
    public Object getForObject(@PathVariable Long id) {
        String url = HOST_MALL_ADMIN + "/brand/{id}";
        CommonResult commonResult = restTemplate.getForObject(url, CommonResult.class, id);
        return commonResult;
    }

    @ApiOperation("postForEntity jsonBody")
    @PostMapping(value = "/post")
    public Object postForEntity(@RequestBody PmsBrand brand) {
        String url = HOST_MALL_ADMIN + "/brand/create";
        ResponseEntity<CommonResult> responseEntity = restTemplate.postForEntity(url, brand, CommonResult.class);
        return responseEntity.getBody();
    }

    @ApiOperation("postForEntity jsonBody")
    @PostMapping(value = "/post2")
    public Object postForObject(@RequestBody PmsBrand brand) {
        String url = HOST_MALL_ADMIN + "/brand/create";
        CommonResult commonResult = restTemplate.postForObject(url, brand, CommonResult.class);
        return commonResult;
    }

    @ApiOperation("postForEntity form")
    @PostMapping(value = "/post3")
    public Object postForEntity3(@RequestParam String name) {
        String url = HOST_MALL_ADMIN + "/productAttribute/category/create";
        // 設置頭訊息
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        // 構造表單參數
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("name", name);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        ResponseEntity<CommonResult> responseEntity = restTemplate.postForEntity(url, requestEntity, CommonResult.class);
        return responseEntity.getBody();
    }
}

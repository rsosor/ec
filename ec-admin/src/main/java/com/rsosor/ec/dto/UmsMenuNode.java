package com.rsosor.ec.dto;

import com.rsosor.ec.model.UmsMenu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 後台菜單節點封裝
 *
 * @author RsosoR
 * @date 2022/2/22
 */
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {

    @ApiModelProperty(value = "子級菜單")
    private List<UmsMenuNode> children;
}

package org.huifer.zkview.model.req;

import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNodeReq {

  /**
   * 节点地址
   */
  @NotEmpty
  private String path;
  /**
   * 节点类型
   */
  @NotEmpty
  private String type;
  /**
   * 节点数据
   */
  @NotEmpty
  private String data;

}

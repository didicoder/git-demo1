package demo1.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @projectName: Git_Demo
 * @package: demo1.pojo
 * @className: User
 * @author: White
 * @description: TODO
 * @date: 2023/2/16 16:24
 * @version: 1.0
 */

@Data
public class User implements Serializable {

    private Long userId;

    private String userAddress;
    
    private String userTele;
}

package shop.mtcoding.getintherelogin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String username; // kakao_ssar@nate.com
    private String password; // UUID
    private String email; // ssar@nate.com
    private String provider; // me, kakao, naver
}

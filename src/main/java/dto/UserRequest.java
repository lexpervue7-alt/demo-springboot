package dto;

import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private AddressDTO address;
}

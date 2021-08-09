package net.ginger.api.UserService.inheritance;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
class Man {
    private final String name;
}
@Data
public class BusinessMan extends Man{
    private final String company;
    private final String position;
}
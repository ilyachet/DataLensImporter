package model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SLA {
    private double slaLast;
    private double slaThis;
    private int countLast;
    private int countThis;
}

package edu.unimagdalena.paygmentservice.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "pay")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID bookingId;
    private String creditCard;
    private String amount;
    private String status;
    private UUID transactionId;

}

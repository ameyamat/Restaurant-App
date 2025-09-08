package RestaurantApp.Restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "restaurants")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantId;

    // Foreign key → Users(user_id)
    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(length = 255)
    private String address;

    @Column(length = 20)
    private String phone;

    @Column(precision = 2, scale = 1) // DECIMAL(2,1)
    private Double rating;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private Status status;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public enum Status {
        ACTIVE,
        INACTIVE,
        PENDING_APPROVAL
    }
}

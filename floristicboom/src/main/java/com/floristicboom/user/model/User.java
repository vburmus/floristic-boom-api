package com.floristicboom.user.model;

import com.floristicboom.credentials.model.Credentials;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "user")
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String imageUri;
    @OneToOne
    @JoinColumn(name = "credentials_id")
    private Credentials credentials;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder().append(id, user.id).append(email, user.email).append(firstName, user.firstName).append(lastName, user.lastName).append(phone, user.phone).append(imageUri, user.imageUri).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(email).append(firstName).append(lastName).append(phone).append(imageUri).toHashCode();
    }
}
package org.michaeldecourci.feature.toggle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder(toBuilder = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FEATURE")
@Entity
public class Feature {

    @Id
    @Column(name = "feature_id")
    private Long id;
    @Column(name = "feature_name", unique = true, nullable = false)
    private String name;
//    private String description;
    private boolean active;
//    private LocalDateTime creationDate;
//    private LocalDateTime expiryDate;
}

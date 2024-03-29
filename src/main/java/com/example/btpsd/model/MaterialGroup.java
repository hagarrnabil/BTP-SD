package com.example.btpsd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "materialGroup")
public class MaterialGroup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long materialGroupCode;

    @Column(unique = true, columnDefinition = "char(225)", nullable = false)
    @Length(max = 225)
    private String code;

    @NotNull
    private String description;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "materialGroup")
    @JsonIgnore
    private Set<ModelSpecificationsDetails> modelSpecificationsDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "materialGroup")
    @JsonIgnore
    private Set<ServiceNumber> serviceNumbers = new HashSet<>();

    public MaterialGroup(String code, String description, Set<ModelSpecificationsDetails> modelSpecificationsDetails, Set<ServiceNumber> serviceNumbers) {
        this.code = code;
        this.description = description;
        this.modelSpecificationsDetails = modelSpecificationsDetails;
        this.serviceNumbers = serviceNumbers;
    }

    public MaterialGroup addModelSpecDetails(ModelSpecificationsDetails modelSpecificationsDetails){
        modelSpecificationsDetails.setMaterialGroup(this);
        this.modelSpecificationsDetails.add(modelSpecificationsDetails);
        return this;
    }

    public MaterialGroup addServiceNumbers(ServiceNumber serviceNumber){
        serviceNumber.setMaterialGroup(this);
        this.serviceNumbers.add(serviceNumber);
        return this;
    }
}

package pl.radoslawkarwacki.hmt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    protected Long id;

    private String uuid = UUID.randomUUID().toString();

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof BaseEntity && Objects.equals(this.uuid, ((BaseEntity) other).uuid);
    }
}

package org.iampekka058.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;
import static java.sql.Types.VARCHAR;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

@Entity
@Getter
@Setter
public class Module {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", length = 36)
  @JdbcTypeCode(VARCHAR)
  private UUID id;

  @Column(name = "name")
  private String name;

}

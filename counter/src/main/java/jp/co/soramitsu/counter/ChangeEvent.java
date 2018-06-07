package jp.co.soramitsu.counter;

import java.time.Instant;
import javax.persistence.Id;
import lombok.Data;

@Data
public class ChangeEvent {
  public enum Type {
    INCREMENT,
    DECREMENT
  }

  @Id
  private Integer id;
  private Type type;
  private String user;
  private Instant time;
}

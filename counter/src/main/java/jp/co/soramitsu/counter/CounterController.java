package jp.co.soramitsu.counter;

import java.util.logging.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/counter")
public class CounterController {
  private static final Logger LOG = Logger.getLogger(CounterController.class.getName());

  @GetMapping("/")
  public ResponseEntity<Integer> get(){
    return null;
  }

  @GetMapping("/increment")
  public ResponseEntity<Integer> increment(){
    return null;
  }

  @GetMapping("/decrement")
  public ResponseEntity<Integer> decrement(){
    return null;
  }

}

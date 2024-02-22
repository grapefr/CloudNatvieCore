package testab.infra;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import testab.domain.Approved;


@FeignClient(name = "models")
public interface ModelClient {
  @GetMapping("/models/{id}")
  Approved callOtherService(@PathVariable("id") Long id);
}
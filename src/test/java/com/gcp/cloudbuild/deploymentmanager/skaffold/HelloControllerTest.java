package com.gcp.cloudbuild.deploymentmanager.skaffold;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import com.gcp.cloudbuild.deploymentmanager.skaffold.controller.HelloController;

public class HelloControllerTest {

	@Test
	void testHelloEndpoint() {
		HelloController controller = new HelloController();
		assertThat(controller.hello()).isEqualTo("Hello, GCP Skaffold!");
	}
}
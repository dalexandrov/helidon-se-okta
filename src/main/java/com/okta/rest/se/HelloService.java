
package com.okta.rest.se;

import io.helidon.security.Principal;
import io.helidon.security.SecurityContext;
import io.helidon.security.Subject;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public class HelloService implements Service {

    @Override
    public void update(Routing.Rules rules) {
        rules.get("/", this::getDefaultHelloHandler);
    }

    private void getDefaultHelloHandler(ServerRequest request, ServerResponse response) {
        //Here we print the Principal Name
        response.send(request.context().get(SecurityContext.class).flatMap(SecurityContext::user).map(
                Subject::principal).map(Principal::getName).orElse("Anonymous"));

    }
}
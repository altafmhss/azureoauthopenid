//package com.svscorp.svscorp.controller;
//
//
//import com.azure.spring.aad.webapi.AADOAuth2OboAuthorizedClientRepository;
//import com.azure.spring.aad.webapp.AADOAuth2AuthorizedClientRepository;
//import com.azure.spring.autoconfigure.aad.AADAuthenticationProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
//import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
//import org.springframework.security.oauth2.client.endpoint.DefaultRefreshTokenTokenResponseClient;
//import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.security.access.prepost.PreAuthorize;
//
//import static com.svscorp.svscorp.util.JsonMapper.toJsonString;
//
//@RestController
//public class HelloController {
//    @Autowired
//    private AADAuthenticationProperties aadAuthenticationProperties;
////    @Autowired
////    private OAuth2AuthorizedClientService authorizedClientService;
//
////    private final OAuth2AuthorizedClientService authorizedClientService;
////
////    public HelloController(OAuth2AuthorizedClientService authorizedClientService) {
////        this.authorizedClientService = authorizedClientService;
////    }
////    Authentication authentication =
////            SecurityContextHolder
////                    .getContext()
////                    .getAuthentication();
////
////    OAuth2AuthenticationToken oauthToken =
////            (OAuth2AuthenticationToken) authentication;
//
//
//
////    @GetMapping("/")
////    public String index(Model model, OAuth2AuthenticationToken authentication) {
////        final OAuth2AuthorizedClient authorizedClient =
////                this.authorizedClientService.loadAuthorizedClient(
////                        authentication.getAuthorizedClientRegistrationId(),
////                        authentication.getName());
////        model.addAttribute("userName", authentication.getName());
////        model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
////        return "index";
////    }
//
//
//    @GetMapping("/nm")
//    public String index5(
//            Model model,
//            OAuth2AuthenticationToken authentication,
//            @RegisteredOAuth2AuthorizedClient("azure") OAuth2AuthorizedClient azureClient
//    ) {
//        return authentication.getName();
//    }
//
//    @GetMapping("/graph")
//    @ResponseBody
//    public String graph(
//            @RegisteredOAuth2AuthorizedClient("graph") OAuth2AuthorizedClient graphClient
//    ) {
//        // toJsonString() is just a demo.
//        // oAuth2AuthorizedClient contains access_token. We can use this access_token to access resource server.
//        return toJsonString(graphClient);
//    }
//
//
//
////
////    @GetMapping("/name")
////    public String index2() {
////      aadAuthenticationProperties.getClientId();
////       String abc= aadAuthenticationProperties.getTenantId();
////       return abc;
////    }
////
////
//////    @GetMapping("/name")
//////    public String index(OAuth2AuthenticationToken authentication) {
//////        final OAuth2AuthorizedClient authorizedClient =
//////                this.authorizedClientService.loadAuthorizedClient(
//////                        authentication.getAuthorizedClientRegistrationId(),
//////                        authentication.getName());
//////        String accessToken=authorizedClient.getAccessToken().getTokenValue();
//////        return accessToken;
////////        System.out.println(accessToken);
////////        model.addAttribute("userName", authentication.getName());
////////        return "index";
//////    }
////@GetMapping( "/home" )
////public String home( @AuthenticationPrincipal(expression = "claims['username']") String name ) {
////    return String.format( "Hello %s!  welcome to the Security app", name);
////}
////
////
////    @GetMapping("/tk" )
////    public String test(OAuth2AuthorizedClient authorizedClient) {
//////        final OAuth2AuthorizedClient authorizedClient =
//////                this.authorizedClientService.loadAuthorizedClient(
//////                        authentication.getAuthorizedClientRegistrationId(),
//////                        authentication.getName());
////        String accessToken=authorizedClient.getAccessToken().getTokenValue();
////
//////        System.out.println(Graph.getUser( accessToken));
////
////        return accessToken;
////    }
////
////
////
////    @GetMapping("/appusers")
////    @ResponseBody
////    @PreAuthorize("hasRole('ROLE_appusers')")
////    public String group1() {
////
//////        AADOAuth2AuthorizedClientRepository clientService;
//////        final OAuth2AuthorizedClient client = clientService
//////                .loadAuthorizedClient(token.getAuthorizedClientRegistrationId(), token.getName());
//////
//////        OAuth2AuthorizedClient client =
//////                clientService.loadAuthorizedClient(
//////                        oauthToken.getAuthorizedClientRegistrationId(),
//////                        oauthToken.getName());
//////
//////        String accessToken = client.getAccessToken().getTokenValue();
////
////        return "Hello appusers 1 Users!";
////    }
////    @GetMapping("/token")
////    public String user(OAuth2AuthenticationToken authentication) {
////        DefaultOidcUser user = (DefaultOidcUser) authentication.getPrincipal();
////        return user.getFullName();
//////        return user.getIdToken().getTokenValue();
////    }
////    @GetMapping("/guestgroup")
////    @ResponseBody
////    @PreAuthorize("hasRole('ROLE_guestgroup')")
////    public String group2() {
////        return "Hello guestgroup 2 Users!";
////    }
//}
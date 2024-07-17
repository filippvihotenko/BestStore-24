package by.viho.customerapp.config;

import by.viho.customerapp.client.WebCLientFeedbackServiceReviewsClient;
import by.viho.customerapp.client.WebClientFeedbackFavouritesClient;
import by.viho.customerapp.client.WebClientItemsClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig

{
    @Bean

    public WebClient.Builder lbWebClientBuilder(){
        return WebClient.builder();
    }

    @Bean
    public WebClientItemsClient webClientItemsClient(){
        return new WebClientItemsClient(lbWebClientBuilder().baseUrl("http://localhost:8081").build());
    }
    @Bean
    public WebCLientFeedbackServiceReviewsClient webClientItemsClientFeedbackServiceReviewsClient(){
        return new WebCLientFeedbackServiceReviewsClient(lbWebClientBuilder().baseUrl("http://localhost:8084").build());
    }
    @Bean
    public WebClientFeedbackFavouritesClient webClientFeedbackFavouritesClient(){
        return new WebClientFeedbackFavouritesClient(lbWebClientBuilder().baseUrl("http://localhost:8084").build());
    }

}

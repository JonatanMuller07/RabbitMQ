package com.jonatanmuller.rabbit_publisher;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "publish")
@RequiredArgsConstructor
public class PublisherController {

    private final RabbitTemplate template;

    @PostMapping(path = "color")
    public String publishColor(@RequestBody Models.Color color) {
        this.template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY_COLOR, color);
        return "Color message send sucess";
    }

    @PostMapping(path = "shape")
    public String publishShape(@RequestBody Models.Shape shape) {
        this.template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY_SHAPE, shape);
        return "Shape message send sucess";
    }
}

package com.jonatan.muller.rabbit_consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsumerListeners {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_COLOR)
    public void readColorMsg(Models.Color color) {
        log.info("Recieving color: {}", color);
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_SHAPE)
    public void readShapeMsg(Models.Shape shape) {
        log.info("Recieving shape: {}", shape);
    }
}

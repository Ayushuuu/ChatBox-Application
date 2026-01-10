package com.app.chatBox.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {

    private int id;
    private String sender;
    private String content;
}

package com.example.backend.dto;

import java.util.List;

public record TarotResponse(List<TarotCardDto> cards, String response) {
}

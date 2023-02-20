package com.example.decoratespring;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LeRepoDecorator implements LeRepo {
    private final LeRepo delegate;

    @Override
    public String getFirst() {
        return delegate.getFirst().toUpperCase();
    }

    @Override
    public Long deleteAll() {
        return delegate.deleteAll() * 100L;
    }
}

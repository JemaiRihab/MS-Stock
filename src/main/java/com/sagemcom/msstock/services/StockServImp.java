package com.sagemcom.msstock.services;

import com.sagemcom.generic.ServiceGeneric;
import com.sagemcom.msstock.entities.Stock;
import com.sagemcom.msstock.repositories.StockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class StockServImp extends ServiceGeneric<Stock, Long> implements StockServ{
    private final StockRepo stockRepo;
    @Override
    public Stock save(Stock entity) {
        entity.setCreatedAt(LocalDate.now());
        return stockRepo.save(entity);
    }
}

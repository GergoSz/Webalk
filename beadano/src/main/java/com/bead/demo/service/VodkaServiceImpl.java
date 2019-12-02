package com.bead.demo.service;

import com.bead.demo.model.Vodka;
import com.bead.demo.persist.VodkaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VodkaServiceImpl implements VodkaRepo {

    @Autowired
    private VodkaRepo vodkaRepo;

    @Override
    public Optional<Vodka> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Vodka findByName(String name) {
        return vodkaRepo.findByName(name);
    }

    @Override
    public List<Vodka> findAll() {
        return null;
    }

    @Override
    public List<Vodka> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Vodka> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Vodka> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Vodka vodka) {

    }

    @Override
    public void deleteAll(Iterable<? extends Vodka> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Vodka> S save(S s) {
        return null;
    }

    @Override
    public <S extends Vodka> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Vodka> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Vodka> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Vodka getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Vodka> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Vodka> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Vodka> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Vodka> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Vodka> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Vodka> boolean exists(Example<S> example) {
        return false;
    }
}

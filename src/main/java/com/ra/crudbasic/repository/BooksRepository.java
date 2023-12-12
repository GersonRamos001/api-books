package com.ra.crudbasic.repository;

import com.ra.crudbasic.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
}

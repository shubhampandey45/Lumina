package com.sp45.lumina.domain.repo

import com.sp45.lumina.common.BookCategoryModel
import com.sp45.lumina.common.BookModel
import com.sp45.lumina.common.ResultState
import kotlinx.coroutines.flow.Flow

interface AllBookRepo {

    fun getAllBooks(): Flow<ResultState<List<BookModel>>>
    fun getAllCategory(): Flow<ResultState<List<BookCategoryModel>>>
    fun getAllBooksByCategory(category: String): Flow<ResultState<List<BookModel>>>
}
package com.Java.Multithreading.Multithreading_Game_Exchange;
public class Information {
}

// Игра - биржа.
// Участники:
// Биржа.
// 3 кирпичных завода.
// 3 застройщика зданий из кирпича.
// 1 завод по выпуску металла.
// 1 строитель мостов.

// Планы оптимизации:
// Кол-во синхронизированных методов д.б. только 2! т.к. синхронизация по объекту. разные товары - разные объекты. лимит один.
// активный вход с консоли ? Добавить еще иные комплектующие для моста и производителя.
// Добавить поставки сырья для производителя кирпича.
// Ввести продаже зданий и начисление денежных средств на банковский счет.
// Оптимизировать наименования полей.
// daemons, join
// Кирпичный завод сам стартует потоки для запуска других заводов, поставляющих материал для производства кирпичей.
// вложенные синхронизированные метода
// enum класс добавить на виды продукции (1001, 1002).

//System.out.println("Игра началась (будет запущено 8 потоков).");

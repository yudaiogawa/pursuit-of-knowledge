package com.example.boite

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(FooTest::class, BarTest::class)
class FooBarSuiteTest

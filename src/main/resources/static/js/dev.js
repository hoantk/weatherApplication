!function(){function r(e,n,t){function o(i,f){if(!n[i]){if(!e[i]){var c="function"==typeof require&&require;if(!f&&c)return c(i,!0);if(u)return u(i,!0);var p=new Error("Cannot find module '"+i+"'");throw p.code="MODULE_NOT_FOUND",p}var a=n[i]={exports:{}};e[i][0].call(a.exports,function(r){return o(e[i][1][r]||r)},a,a.exports,r,e,n,t)}return n[i].exports}for(var u="function"==typeof require&&require,i=0;i<t.length;i++)o(t[i]);return o}return r}()({1:[function(r,e,n){window.component=function(r,e){var r=document.querySelector("#import-"+r).import,n=r.querySelector("#"+e).innerHTML;return document.write(n)}},{}]},{},[1]);
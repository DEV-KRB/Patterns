FROM ubuntu:latest
LABEL authors="java"

ENTRYPOINT ["top", "-b"]
FROM nginx:alpine
MAINTAINER Mayank
COPY . /usr/share/nginx/html
EXPOSE 80

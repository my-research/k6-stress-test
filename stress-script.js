import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
  vus: 100,
  duration: '10s',
};

export default function () {
  http.get('http://host.docker.internal:8080/users');
  sleep(1);
}
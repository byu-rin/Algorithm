a, b = map(int, input().strip().split(' '))
print(f"a = {a}")
print(f"b = {b}")

#input().split() : 입력을 공백 기준으로 나눕니다.

#map(int, ...) : 나눈 값을 정수로 변환합니다.

#f"a = {a}" : 변수 값을 문자열에 삽입해 출력합니다.

# map() 은 반복 가능한(iterable) 객체의 각 요소에 지정한 함수를 적용하여, 그 결과를 새로운 map 객체로 반환.
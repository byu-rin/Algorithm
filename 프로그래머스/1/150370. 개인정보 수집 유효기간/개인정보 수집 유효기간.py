def get_month_diff(lhs, rhs):
    y1, m1, d1 = map(int, lhs.split('.'))
    y2, m2, d2 = map(int, rhs.split('.'))
    
    diff = 12 * (y2 - y1)
    diff += m2 - m1
    if d2 < d1:
        diff -= 1
    return diff

def solution(today, terms, privacies):
    answer = []
    expires = {term: int(expire) for term, expire in map(lambda x: x.split(), terms)}
    for idx, (start_date, term) in enumerate(map(lambda x: x.split(), privacies), start=1):
        month_diff = get_month_diff(start_date, today)
        if month_diff >= expires[term]:
            answer.append(idx)
    
    return answer
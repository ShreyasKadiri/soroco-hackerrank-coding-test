def timestamp_processor (filename):
    filename = input()
    dict = {}
    with open (filename) as f:
        for line in f:
            ts = line.split()[3][1:]
            if ts in dict:
                dict [ts] += 1 
            else:
                dict [ts] = 1 
    
    with open ("req_" + filename, 'w') as fw:
        for ts in dict:
            if dict[ts] > 1:
                fw.write (ts + "\n")
timestamp_processor("hosts_access_log_00.txt")
